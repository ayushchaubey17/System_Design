package buildeer_Pattern;



public class User {
    private  final  String name;
    private  final String username;
    private  final  String password;

    private User(InnerUser user) {
        this.username = user.username;
        this.name = user.name;
        this.password = user.password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }














    public  static  class  InnerUser{
        private    String name;
        private   String username;
        private    String password;

        public InnerUser setName(String name) {
            this.name = name;
            return this;
        }

        public InnerUser setUsername(String username) {
            this.username = username;
            return this;
        }

        public InnerUser setPassword(String password) {
            this.password = password;
            return this;
        }


        public  User build() {
            return new User(this);
        }

    }


}