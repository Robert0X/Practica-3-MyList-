public class MyArrayList implements MyList {
    String[] s = new String[0];

    @Override
    public boolean add(String s) {
        String[] newArray = new String[this.s.length + 1];
        System.arraycopy(this.s, 0, newArray, 0, this.s.length);
        newArray[newArray.length - 1] = s;
        this.s = newArray;
        return true;
    }

    @Override
    public boolean contains(String s) {
        for (String str : this.s) {
            if (str.equals(s)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int i) {
        if (i >= 0 && i < this.s.length) {
            return this.s[i];
        } else {
            return null;
        }
    }

    @Override
    public int index(String s) {
        for (int i = 0; i < this.s.length; i++) {
            if (this.s[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(int i) {
        if (i >= 0 && i < this.s.length) {
            String[] newArray = new String[this.s.length - 1];
            System.arraycopy(this.s, 0, newArray, 0, i);
            System.arraycopy(this.s, i + 1, newArray, i, this.s.length - i - 1);
            this.s = newArray;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(String s) {
        int index = this.index(s);
        if (index != -1) {
            this.remove(index);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return this.s.length;
    }
}