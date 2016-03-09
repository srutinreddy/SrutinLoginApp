package arrayList;

import android.support.design.R;

import java.util.ArrayList;

/**
 * Created by Srutin Reddy on 1/21/2016.
 */
public class StudentList {

    public static ArrayList<String> List(){
        ArrayList<String> list = new ArrayList<>();
        list.add("student1");
        list.add("student2");
        list.add("student3");
        list.add("student4");
        list.add("student5");
        list.add("student6");
        list.add("student7");
        list.add("student8");
        list.add("student9");
        list.add("student10");
        list.add("student11");
        list.add("student12");
        list.add("student13");
        list.add("student14");
        list.add("student15");
        list.add("student16");
        list.add("student17");
        list.add("student18");
        list.add("student19");

        return list;
    }


    public static ArrayList<StudentEntity> getStudentEntities(){
        ArrayList<StudentEntity> list = new ArrayList<StudentEntity>();
        StudentEntity entity=new StudentEntity();
        //entity.setImage(R.drawable.ball);
        entity.setName("srutin");
        list.add(entity);


        return list;
    }

}