package designPatterns.task2;

public class Student {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int course;
    private String birthCity;
    private String university;

    private Student(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        birthYear = builder.birthYear;
        course = builder.course;
        birthCity = builder.birthCity;
        university = builder.university;
    }
// Геттеры для всех полей класса

    public static class Builder {
        private String firstName;
        private String lastName;
        private int birthYear;
        private int course;
        private String birthCity;
        private String university;

        public Builder() {
        }

        // Сеттеры для всех полей класса

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setBirthYear(int birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public Builder setCourse(int course) {
            this.course = course;
            return this;
        }

        public Builder setBirthCity(String birthCity) {
            this.birthCity = birthCity;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
