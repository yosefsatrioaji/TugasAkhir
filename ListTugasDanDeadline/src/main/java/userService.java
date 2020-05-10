public class userService {
    private String[][] data = new String[4][2];
    private String user, pass;
    
    //constructor
    public userService(String users, String passwords)
    {
        user = users;
        pass = passwords;
        String[][] data = 
        { 
            {"admin", "12345",},
            {"satrio", "12345"}
        };
        this.data = data;

    }
    
    public boolean checkCredential() //mengecek input sesuai dengan data constructor atau tidak
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(user))
            {
                if(data[i][1].equals(pass))
                {
                    return true;
                }
            }
        }
        return false;
    }
}