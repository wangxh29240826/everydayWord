package FiveWeek;

public class Day6Address implements Cloneable{
        private String state;
        private String province;
        private String city;

        public Day6Address(String state, String province, String city) {// 利用构造方法进行初始化
            this.state = state;
            this.province = province;
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {// 重写toString()方法
            StringBuilder sb = new StringBuilder();
            sb.append("国家：" + state + ", ");
            sb.append("省：" + province + ", ");
            sb.append("市：" + city);
            return sb.toString();
        }

        @Override
        protected Day6Address clone() {// 实现浅克隆
            Day6Address address = null;
            try {
                address = (Day6Address) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return address;
        }
    }
