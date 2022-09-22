package scenes.indexopt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

public class CloneTest {

    @Getter
    @Setter
    public static class Student implements Cloneable {
        String name;
        Integer age;

        public Student() {
        }

        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public Student clone() {
            try {
                return (Student) super.clone();

            } catch (Exception e) {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student("yuanzhou", 28);
        Student clone = student.clone();
        Integer age = clone.getAge();
        age = 27;
        System.out.println(JSON.toJSON(student));
        System.out.println(JSON.toJSON(clone));


        System.out.println((650 / 100) * 100);

        Integer minAmount = 6500;
        System.out.println(((minAmount / 10) / 100) * 100);

        JSONObject jsonObject = new JSONObject().fluentPut("hello", "world");
        //JSONArray hello = Optional.ofNullable(jsonObject.getJSONArray("hello")).orElse(new JSONArray());

        System.out.println(jsonObject.getJSONArray("hello") != null);
    }
}
