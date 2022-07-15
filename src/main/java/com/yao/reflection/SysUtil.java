package com.yao.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jack Yao on 2022/3/10 4:21 PM
 */
public class SysUtil {
    public static void convertPOJOToDTO(Object pojo, Object dto) {
        if(pojo != null) {
            try {
                List<Field> fields = Arrays.asList(pojo.getClass().getDeclaredFields());

                boolean dtoHasId = Arrays.asList(dto.getClass().getDeclaredFields())
                        .stream()
                        .anyMatch(field -> field.getName().toString().equals("id"));
                if(dtoHasId) {
                    Method idGetter = pojo.getClass().getMethod("getId");
                    Method idSetter = dto.getClass().getMethod("setId", Integer.class);
                    idSetter.invoke(dto, idGetter.invoke(pojo));
                }

                for (Field pojoField : fields) {
                    String methodName = "get" + Character.toUpperCase(pojoField.getName().charAt(0)) + pojoField.getName().substring(1);
                    Method pojoGetter = pojo.getClass().getMethod(methodName);
//                    if(directlyConvertibleClasses.contains(pojoGetter.getReturnType())) {
//                        Method dtoSetter = dto.getClass().getMethod("set" + pojoGetter.getName().substring(3), pojoGetter.getReturnType());
//                        dtoSetter.invoke(dto, pojoGetter.invoke(pojo));
//                    }
                }

            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
