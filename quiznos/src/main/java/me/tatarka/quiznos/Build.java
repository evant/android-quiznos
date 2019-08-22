package me.tatarka.quiznos;

public class Build {

    private Build() {
    }

    public static class VERSION {
        public static final int SDK_INT = android.os.Build.VERSION.SDK_INT;

        private VERSION() {
        }
    }

    public static class VERSION_CODES {
        public static final int Q = 29;
        public static final int QUIZNOS = 29;
        public static final int QUECHE = 29;
        public static final int ANDROID_10 = 29;
        public static final int TEN = 29;

        private VERSION_CODES() {
        }
    }
}
