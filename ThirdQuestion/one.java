package ThirdQuestion;
import java.util.*;

public class one {
    public static void main(String[] args) {
        // 用于存储每个人的错题统计
        Map<String, Map<String, Integer>> allData = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入姓名（如小明），输入end结束：");
            String name = scanner.nextLine();
            if ("end".equals(name)) break;

            // 初始化该同学的错题统计map
            allData.putIfAbsent(name, new HashMap<>());
            Map<String, Integer> map = allData.get(name);

            // 先录入一组原始数据
            if (map.isEmpty() && name.equals("小明")) {
                String[] data = {"math:5","English:10","Chinese:10","math:20","English:10","chemistry:30","math:10","math:20"};
                for (String entry : data) {
                    String[] parts = entry.split(":");
                    String subject = parts[0];
                    int count = Integer.parseInt(parts[1]);
                    map.put(subject, map.getOrDefault(subject, 0) + count);
                }
            }

            // 动态输入错题数据
            while (true) {
                System.out.println("请输入科目和错题数，(格式为科目:错题数)输入end结束");
                String input = scanner.nextLine();
                if ("end".equals(input)) break;
                String[] parts = input.split(":");
                String subject = parts[0];
                int count = Integer.parseInt(parts[1]);
                map.put(subject, map.getOrDefault(subject, 0) + count);
            }

            // 输出该同学的错题统计和最多错题的科目
            System.out.println(name + "的错题统计：" + map);
      
        }
        scanner.close();
    }

    // 定义一个方法用于输出错题最多的科目及其错题数
    public static void sout(Map<String,Integer> map){
        if (map.isEmpty()) {
            System.out.println("没有错题数据。");
            return;
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        System.out.println("错题最多的科目：" + list.get(0).getKey() + "，错题数：" + list.get(0).getValue());
    }
}