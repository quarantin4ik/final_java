package final_java;

import java.util.*;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
      if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(phoneNum);
            phoneBook.put(name, numbers);
        }

}
public ArrayList<Integer> find(String name) {

      if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            return new ArrayList<>();
        }
}

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        List<Map.Entry<String, ArrayList<Integer>>> list = new ArrayList<>(phoneBook.entrySet());
        list.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        HashMap<String, ArrayList<Integer>> sortedPhoneBook = new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : list) {
            sortedPhoneBook.put(entry.getKey(), entry.getValue());

    }
    
    return sortedPhoneBook;

    }
}
 


