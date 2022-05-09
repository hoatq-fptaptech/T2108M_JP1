package library;

import java.util.ArrayList;

public abstract class Repository implements IStudentInterface{
    @Override
    public abstract ArrayList<Student> list();

    @Override
    public abstract void create(Student student);

    @Override
    public abstract void update(Student student);
    @Override
    public abstract void delete(Student student);
}
