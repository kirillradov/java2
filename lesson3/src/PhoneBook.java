import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> record = new HashMap<String, String>();

    public void add(String phone,String surname) {
        record.put(phone, surname);
    }

    public void get(String surname) {
            HashMap<String, String> records = new HashMap<String, String>();
            for (Map.Entry<String, String> value: record.entrySet()) {
                if (surname.equals(value.getValue())) {
                    records.put(value.getKey(), value.getValue());
                }
            }
             System.out.println(records);

    }
}



