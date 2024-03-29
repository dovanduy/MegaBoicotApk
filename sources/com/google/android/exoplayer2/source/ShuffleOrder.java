package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

public interface ShuffleOrder {

    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int i) {
            this(i, new Random());
        }

        public DefaultShuffleOrder(int i, long j) {
            this(i, new Random(j));
        }

        private DefaultShuffleOrder(int i, Random random2) {
            this(createShuffledList(i, random2), random2);
        }

        private DefaultShuffleOrder(int[] iArr, Random random2) {
            this.shuffled = iArr;
            this.random = random2;
            this.indexInShuffled = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.indexInShuffled[iArr[i]] = i;
            }
        }

        public int getLength() {
            return this.shuffled.length;
        }

        public int getNextIndex(int i) {
            int i2 = this.indexInShuffled[i] + 1;
            if (i2 < this.shuffled.length) {
                return this.shuffled[i2];
            }
            return -1;
        }

        public int getPreviousIndex(int i) {
            int i2 = this.indexInShuffled[i] - 1;
            if (i2 >= 0) {
                return this.shuffled[i2];
            }
            return -1;
        }

        public int getLastIndex() {
            if (this.shuffled.length > 0) {
                return this.shuffled[this.shuffled.length - 1];
            }
            return -1;
        }

        public int getFirstIndex() {
            if (this.shuffled.length > 0) {
                return this.shuffled[0];
            }
            return -1;
        }

        public ShuffleOrder cloneAndInsert(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                iArr[i3] = this.random.nextInt(this.shuffled.length + 1);
                int i4 = i3 + 1;
                int nextInt = this.random.nextInt(i4);
                iArr2[i3] = iArr2[nextInt];
                iArr2[nextInt] = i3 + i;
                i3 = i4;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.shuffled.length + i2)];
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.shuffled.length + i2; i7++) {
                if (i5 >= i2 || i6 != iArr[i5]) {
                    int i8 = i6 + 1;
                    iArr3[i7] = this.shuffled[i6];
                    if (iArr3[i7] >= i) {
                        iArr3[i7] = iArr3[i7] + i2;
                    }
                    i6 = i8;
                } else {
                    int i9 = i5 + 1;
                    iArr3[i7] = iArr2[i5];
                    i5 = i9;
                }
            }
            return new DefaultShuffleOrder(iArr3, new Random(this.random.nextLong()));
        }

        public ShuffleOrder cloneAndRemove(int i) {
            int i2 = 0;
            int[] iArr = new int[(this.shuffled.length - 1)];
            boolean z = false;
            while (i2 < this.shuffled.length) {
                if (this.shuffled[i2] == i) {
                    z = true;
                } else {
                    iArr[z ? i2 - 1 : i2] = this.shuffled[i2] > i ? this.shuffled[i2] - 1 : this.shuffled[i2];
                }
                i2++;
            }
            return new DefaultShuffleOrder(iArr, new Random(this.random.nextLong()));
        }

        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.random.nextLong()));
        }

        private static int[] createShuffledList(int i, Random random2) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random2.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }
    }

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int length;

        public int getPreviousIndex(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }

        public UnshuffledShuffleOrder(int i) {
            this.length = i;
        }

        public int getLength() {
            return this.length;
        }

        public int getNextIndex(int i) {
            int i2 = i + 1;
            if (i2 < this.length) {
                return i2;
            }
            return -1;
        }

        public int getLastIndex() {
            if (this.length > 0) {
                return this.length - 1;
            }
            return -1;
        }

        public int getFirstIndex() {
            return this.length > 0 ? 0 : -1;
        }

        public ShuffleOrder cloneAndInsert(int i, int i2) {
            return new UnshuffledShuffleOrder(this.length + i2);
        }

        public ShuffleOrder cloneAndRemove(int i) {
            return new UnshuffledShuffleOrder(this.length - 1);
        }

        public ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i, int i2);

    ShuffleOrder cloneAndRemove(int i);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i);

    int getPreviousIndex(int i);
}
