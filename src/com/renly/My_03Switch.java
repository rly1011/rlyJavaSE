package com.renly;

/**
 * @author ${任岚杨}
 * @title: My_03Switch
 * @projectName workspace_renly
 * @description: TODO
 * @date 2019/4/2916:06
 */
public class My_03Switch {
    /**
     * switch(expression){
     *     case value :
     *        //语句
     *        break; //可选
     *     case value :
     *        //语句
     *        break; //可选
     *     //你可以有任意数量的case语句
     *     default : //可选
     *        //语句
     * }
     * @param args
     */
    public static void main(String[] args) {
        String color="白";
        switch (color){
            case "白":
                System.out.println("打开"+color+"颜色的灯光");
                break;
            case "红":
                System.out.println("打开"+color+"颜色的灯光");
                break;
            case "蓝":
                System.out.println("打开"+color+"颜色的灯光");
                break;
            case "紫":
                System.out.println("打开"+color+"颜色的灯光");
                break;
            case "青":
                System.out.println("打开"+color+"颜色的灯光");
                break;
            default:
                System.out.println("灯光短路");
        }
    }
}
