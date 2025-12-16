package com.text.entity;

public class Person {
        private String name;
        private int age;
        private String gender;

       private Person(){}

        public static Person newInstance(){
           return new Person();
        }

}