package com.example.beans;

import org.springframework.beans.factory.support.MethodReplacer;
import java.lang.reflect.Method;

public class MessageReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        if (isMessageMethod(method)) {
            String msg = (String) args[0];
            return String.format("This is replaced message: %s", msg);
        } else {
            throw new IllegalArgumentException(String.format("Unable to reimplement method %s", method.getName()));
        }
    }

    private static boolean isMessageMethod(Method method) {
        if (method.getParameterTypes().length != 1) {
            return false;
        }
        if (!("message".equals(method.getName()))) {
            return false;
        }
        if (method.getParameterTypes()[0] != String.class) {
            return false;
        }
        return true;
    }
}
