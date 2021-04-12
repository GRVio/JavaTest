package com.zzkjzy.javase.grade.self.week1.day3;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FinalTest01 {

    public static void main(String[] args) {
        B b= new B();
        b.doSome();
    }
}

class A{
    public final void doSome(){
        System.out.println("doSome!");
    }
}

class B extends A{

}
