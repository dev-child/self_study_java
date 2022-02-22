package Chap09.sec01.exam06;

public class Button {
    OnClickListerner listerner;

    void setOnClickListener(OnClickListerner listerner) {
        this.listerner = listerner;
    }

    void touch() {
        listerner.onClick();
    }

    static interface OnClickListerner {
        void onClick();
    }
}
