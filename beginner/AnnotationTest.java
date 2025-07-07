package beginner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

// 定义Range注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Range {
    int min() default 0;
    int max() default 100;
}

// 待验证的Person类
class Person {
    @Range(min = 1, max = 100)
    public String name;

    @Range(max=100)
    public String city;
    
    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }
}

// 注解验证器
class AnnotationValidator {
    
    public static void check(Person person) throws IllegalArgumentException, ReflectiveOperationException {
        for (Field field : person.getClass().getFields()) {
            // 获取Field 定义的@Range:
            Range range = field.getAnnotation(Range.class);
            // 如果@Range存在
            if (range != null) {
                Object value = field.get(person);

                // 如果值是String:
                if (value instanceof String s) {
                    // 判断值是否满足@Range的min/ max:
                    if (s.length() < range.min() || s.length() > range.max()) {
                        throw new IllegalArgumentException("Invalid field: " + field.getName());
                    }
                }
            }
        }
    }
}

public class AnnotationTest {

    public static void main(String[] args) {
        try {
            // 创建有效的Person对象
            Person validPerson = new Person("John", "Beijing");
            System.out.println("验证有效对象...");
            AnnotationValidator.check(validPerson);
            System.out.println("验证通过！");
            
            // 创建无效的Person对象（name为空，违反min=1的规则）
            Person invalidPerson = new Person("", "Shanghai");
            System.out.println("验证无效对象...");
            AnnotationValidator.check(invalidPerson);
            System.out.println("验证通过！");
            
        } catch (IllegalArgumentException e) {
            System.err.println("验证失败: " + e.getMessage());
        } catch (ReflectiveOperationException e) {
            System.err.println("反射操作失败: " + e.getMessage());
        }
    }   
}
