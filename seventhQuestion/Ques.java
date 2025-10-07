package seventhQuestion;
public class Ques {
    public static void main(String[] args) {
        // User仓库
        MyRepository<User> repository = new MyRepository<>();
        repository.save(new User("Lubenwei666", 30));
        repository.save(new User("Lubenwei777", 31));
        repository.save(new User("Lubenwei888", 32));
        System.out.println("User仓库：");
        for(User u : repository.map.values()) {
            System.out.println(u);
        }

        // String仓库
        MyRepository<String> stringRepository = new MyRepository<>();
        stringRepository.save("Lubenwei");
        stringRepository.save("Lubenwei777");
        stringRepository.save("Lubenwei888");
        System.out.println("String仓库：");
        for(String s : stringRepository.map.values()) {
            System.out.println(s);
        }

        // Integer仓库
        MyRepository<Integer> intRepository = new MyRepository<>();
        intRepository.save(100);
        intRepository.save(200);
        intRepository.save(300);
        System.out.println("Integer仓库：");
        for(Integer i : intRepository.map.values()) {
            System.out.println(i);
        }
    }
}




