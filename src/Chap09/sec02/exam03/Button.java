package Chap09.sec02.exam03;

public class Button {
    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    OnClickListener listener;

    void touch() {
        listener.onClick();
    }

    static interface OnClickListener {
        void onClick();
    }
}
