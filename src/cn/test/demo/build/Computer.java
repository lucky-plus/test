package cn.test.demo.build;

/**
 * 产品类
 */
public class Computer {

    private String mBoard;

    private String mDisplay;

    private String mOS;

    public String getmBoard() {
        return mBoard;
    }

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public String getmDisplay() {
        return mDisplay;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public String getmOS() {
        return mOS;
    }

    public void setmOS(String mOS) {
        this.mOS = mOS;
    }

    public static class Builder {

        private String mBoard;

        private String mDisplay;

        private String mOS;

        public Builder setmBoard(String mBoard) {
            this.mBoard = mBoard;
            return this;
        }

        public Builder setmDisplay(String mDisplay) {
            this.mDisplay = mDisplay;
            return this;
        }

        public Builder setmOS(String mOS) {
            this.mOS = mOS;
            return this;
        }

        /**
         * 组装产品
         * @param computer
         */
        private void construct(Computer computer) {
            computer.setmBoard(this.mBoard);
            computer.setmDisplay(this.mDisplay);
            computer.setmOS(this.mOS);
        }

        public Computer create() {
            Computer computer = new Computer();
            construct(computer);
            return computer;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
