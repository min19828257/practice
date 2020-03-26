import java.util.ArrayList;


public class ArrList2 {

 static ArrayList<String> list = new ArrayList();
 
 public static void main(String[] args) {
  
  list.add("사과");
  list.add("수박");
  list.add("복숭아");
  list.add("바나나");
  
  
  for(String i : list)System.out.print(i + " ");
  System.out.println();
  
  list.remove("수박"); //지울Obj를 직접 지정
  
  for(String i : list)System.out.print(i + " ");
  System.out.println();
  
 }

}
