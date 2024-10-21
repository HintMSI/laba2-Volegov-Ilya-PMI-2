public class Name {   //1.3
    private String surname;
    private String firstName;
    private String patronymic;

    public Name(String surname, String firstName, String patronymic) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        if (surname != null && !surname.isEmpty()) {
            result.append(surname);
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (result.length() > 0) result.append(" ");
            result.append(firstName);
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            if (result.length() > 0) result.append(" ");
            result.append(patronymic);
        }
        return result.toString().trim(); // del lishnie probeli
    }
}