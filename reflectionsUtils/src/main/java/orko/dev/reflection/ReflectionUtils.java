package orko.dev.reflection;

import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;


public class ReflectionUtils {
	
	public static Method[] getAllPublicMethod(Object o){
		return o.getClass().getMethods();
	}
	
	public static Method getMethodProperty(Object o, String propertyName) throws NoSuchMethodException, SecurityException{
		return o.getClass().getMethod("get"+StringUtils.capitalize(propertyName));
	}
	
}
