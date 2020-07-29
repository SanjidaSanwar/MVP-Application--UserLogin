public class Presenter {

    private User user;
    private View view;

    public Presenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void updateFullName(String fullName){
        user.setFullName(fullName);

    }

    public void updateEmail(String email){
        user.setEmail(email);

    }

}
