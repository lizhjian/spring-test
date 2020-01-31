package com.ziroom.anno;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2020-01-29 10:30
 * </pre>
 */
@SxtTable(tableName = "tx_table")
public class StxStudent {

    @SxtField(columnName = "id",type = "int",length = 10)
    private int id;

    @SxtField(columnName = "student_name",type = "string",length = 20)
    private String studentName;

    @SxtField(columnName = "age",type = "int",length = 10)
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
