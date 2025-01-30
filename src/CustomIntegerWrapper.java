public class CustomIntegerWrapper {
        private final int value; // Field to store integer value

        public CustomIntegerWrapper(int value) {
            this.value = value;
        }

        public int intValue() {
            return value;
        }

        public short shortValue() {
            return (short) value;
        }

        public byte byteValue() {
            return (byte) value;
        }

        public long longValue() {
            return value;
        }

        public double doubleValue() {
            return value;
        }

        public float floatValue() {
            return value;
        }

        // Checks equality between two MyInteger objects
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CustomIntegerWrapper myInt = (CustomIntegerWrapper) obj;
            return value == myInt.value;
        }

        // Returns hash code based on value
        @Override
        public int hashCode() {
            return Integer.hashCode(value);
        }

        // Compares this MyInteger with another
        public int compareTo(CustomIntegerWrapper other) {
            return Integer.compare(this.value, other.value);
        }

        // Converts value to String
        @Override
        public String toString() {
            return String.valueOf(value);
        }


}
