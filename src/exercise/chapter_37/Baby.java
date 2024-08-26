package exercise.chapter_37; // 인터페이스 -implements

public class Baby {
   private String name;
   private int age;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public Baby(String name) {
      this.name = name;
   }
}
