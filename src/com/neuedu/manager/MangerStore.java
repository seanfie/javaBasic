package com.neuedu.manager;


public interface MangerStore {
    /**	 *添加学生方法	 *
     * @param student 对象为学生对象
     * @return 添加成功返回true，添加失败返回false	 */
    boolean addStudent(Student student);
    /**	 * 查找学生方法	 *
     * @param studentNo 根据学生学号查找
     * @return 查找成功返回这个学生对象，查找失败返回null	 */
    Student findStudent(String studentNo);
    /**	 * 删除学生方法	 *
     *  @param studentNo 根据学生学号进行查找，然后删除	 *
     *  @return 删除成功返回true，删除失败返回false	 */
    boolean deleteStudent(String studentNo);
    /**	 * 修改学生信息方法
     * * @param studentNo 根据学生学号查找，然后修改信息	 *
     * @return 修改成功返回学生对象，修改失败返回null	 */
    Student updateStudent(String studentNo, String name, String grade, int age);
    /**	 * 显示所有学生信息，包括姓名，学号，班级，年龄。	 */
    void showAll();
}


