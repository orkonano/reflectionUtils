package orko.dev.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Vector;

public class AnnotationsUtils {
	
	public static Vector<Method> getAllMethodWithAnnotations(Object o, Class<? extends Annotation> a){
		Method[] methodClass = ReflectionUtils.getAllPublicMethod(o);
		Vector<Method> vector = new Vector<Method>();
		for (int i = 0; i < methodClass.length; i++) {
			Method method = methodClass[i];
			if (method.isAnnotationPresent(a)){
				vector.add(method);
			}
		}
		return vector;
	}
	
	public static Annotation getAnnotation(Method m, Class<? extends Annotation> a){
		return m.isAnnotationPresent(a)?m.getAnnotation(a):null;
	}

}
