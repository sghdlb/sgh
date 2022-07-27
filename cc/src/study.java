public class study {   /**
 * 属性或者特征去描述该类
 * 学号
 * 姓名
 * 年龄
 * 性别
 * 就读学校
 * 成绩
 */
public String studentNo;
    public String suedentName;
    public int studentAge;
    public String studentMale;
    public String getStudentSchool;
    public int getStudentScore;

    /**
     * 行为
     * 上晚自习
     * 泡图书馆
     * 上课
     * 做广播体操
     */
    public void goToNightClass() {
        System.out.println("我们在认真的上晚自习");
    }
    public void immerseOneselfInTheLibrary() {
        System.out.println("我在图书馆读书很开心");
    }
    public void attendClass() {
        System.out.println("我在专心致志的上课");
    }
    public void doRadioExercise() {
        System.out.println("我在开心的做广播体操");
    }


}
