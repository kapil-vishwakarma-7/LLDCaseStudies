package com.design.v1.entity;
/*
* SOLID
*
* Single Responsibility Principle
*       It should be followed at every level
*           - package, class, method
*       Where SRC Violated
*           - lots of if_else
*           - Monster Methods : which do a lot more than their name.
*           - Avoid putting code in Common/Help/Utility package/classes.
*
* Open/Close principle
* Current class also violating Open/Close principle
*       O - my codebase should be open for extension but close for modification.
*   My codebase should make it easy to add new feature, but adding new features require very less or no change in code base.
*   New features should be added by new method/classes.
*
* Benefits
*   - Testing is easy
*   - No Regression ( something that used work earlier stops).
*   -
*
* */
public class Bird {
    private double weight;
    private String color;
    private String type;
    private String bokeType;

    public void fly(){
        // Every bird has different type of fly methods.
        if (type == "sparrow"){

        }else if (type == "peigon"){

        }else if (type == "crow"){

        }
        // ... there can be too many if else.
    }
    public void eat(){

    }

    public void sleep(){

    }

    public void makeSound(){

    }
}
