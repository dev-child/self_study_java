package Chap09.sec01.exam06;

public class MessageListener implements Button.OnClickListerner{
    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}
