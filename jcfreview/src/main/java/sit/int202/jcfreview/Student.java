package sit.int202.jcfreview;

import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode (exclude = "gpax")
public class Student {
    private Integer id;
    private String name;
    private Double gpax;
    public  static final Comparator<Student> STUDENT_COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.id - s2.id;
        }
    };
}
