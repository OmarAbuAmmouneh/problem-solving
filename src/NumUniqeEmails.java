import java.util.ArrayList;
import java.util.List;

class NumUniqeEmails {
    public int numUniqueEmails(String[] emails) {
        //Ignore . in the localname
        //+ in the localname will ignore everything after it

        List<String> list = new ArrayList<>();

        for (String email: emails) {
            String[] arr = email.split("@");
            String local = arr[0];
            String domain = arr[1];

            StringBuilder sb = new StringBuilder();
            sb.append("@");
            sb.append(domain);
            for (int i = 0; i < local.length(); i++) {
                char c = local.charAt(i);
                if (c == '+') {
                    break;
                } else if (c != '.') {
                    sb.insert(0, String.valueOf(c));
                }
            }
            if (!list.contains(sb.toString())) {
                list.add(sb.toString());
            }
        }

        return list.size();
    }
}