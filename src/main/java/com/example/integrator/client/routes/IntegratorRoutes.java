package com.example.integrator.client.routes;


import com.example.integrator.client.customproccesor.CustomProccesor;
import com.example.integrator.client.helper.CustomProccesorImpl;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.xmljson.XmlJsonDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IntegratorRoutes  extends RouteBuilder {

    @Autowired
    private CustomProccesorImpl customProccesorImpl;

    @Autowired
    XmlJsonDataFormat xmlJsonDataFormat;

    @Override
    public void configure() throws Exception {

        from("ftp://localhost:21/tempD?username=xxxxxxxxx&password=xxxxxxx&autoCreate=false&noop=true&idempotentKey=${file:modified}")
                .log("RecivedMessage::::Validating::::::::=>>> ${body}")
                .filter().method("customProccesorImpl" ,"validate")
                    .to("bean:customProccesorImpl?method=transformCreateOrder")
                        .log("after transforming:::::::${body}")
                        .marshal(xmlJsonDataFormat)
                            .to("http://localhost:8081/godam/api/createOrder");





    }
}




//.bean("customProccesorImpl","validate")
//.to("bean:customProccesorImpl?method=validate","bean:customProccesorImpl?method=transformCreateOrder")
//.filter().method("customProccesorImpl", "transformCreateOrder")
// .transform(method("customProccesorImpl", "transformCreateOrder"))
//.bean("customProccesorImpl", "transformCreateOrder")
