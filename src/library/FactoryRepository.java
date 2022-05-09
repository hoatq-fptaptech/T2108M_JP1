package library;

public class FactoryRepository {
    public static final Repository createRepository(RepositoryType repositoryType){
        switch (repositoryType){
            case STUDENT: return new StudentRepository();
            default:throw new IllegalArgumentException("Class not found!");
        }
    }
}
