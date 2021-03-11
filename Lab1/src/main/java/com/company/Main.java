package com.company;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //Задание 1: Показать использование конструкторов базового и производного классов
		System.out.println("-----Task 1:-----");
        ComplexNum n1 = new ComplexNum(2.5, 6.4);
	    ComplexNumForms num1 = new ComplexNumForms(2.0, 3.0);
		System.out.println(num1.format(ComplexNumForms.FORMAT.STANDARD));
	    System.out.println(num1.format(ComplexNumForms.FORMAT.EXPONENTIAL));

	    //Задание 2: С помощью рефлексии обойти методы и вызвать методы помеченные анотацией
	    Class clz = num1.getClass();
	    System.out.println("\n-----Task 2:-----");
	    for(Method method: clz.getMethods()){
	        if(method.isAnnotationPresent(Show.class)){
	            System.out.println("ShowNum(" + method.getName() + "): " + method.invoke(num1));
            }
        }

		//Задание 3: Вывести список методов с аннотациями и типами параметров
		//Вывести название пакета и короткое (простое) имя класса
		System.out.println("\n-----Task 3:-----");
        for(Method method: clz.getMethods()){
        	if(method.isAnnotationPresent(Show.class)){
				System.out.println("\nMethod: " + method.getName());
				System.out.println("Return type : " +
						method.getReturnType().getName());
				Class<?>[] params = method.getParameterTypes();
				System.out.println("Parameters type: ");
				for (Class<?> param : params)
					System.out.print(param.getName());
			}
        }
		System.out.println("\nPackage name: " + clz.getPackage());
        System.out.println("Get simple class name: " + clz.getSimpleName());


        //Задание 4: Создать прокси-объект, который пропускает только вызовы гетеров
		System.out.println("\n-----Task 4:-----");
		//Получаем загрузчик класса у объекта
		ClassLoader complexNum = num1.getClass().getClassLoader();
		//Получаем все интерфейсы, которые реализует оригинальный объект
		Class[] interfaces = num1.getClass().getInterfaces();
		//Создаем прокси объекта
		Complex proxy = (Complex) Proxy.newProxyInstance(complexNum, interfaces, new MyProxy(num1));

		System.out.println(proxy.getArg());
		proxy.setNum(n1);
    }
}
