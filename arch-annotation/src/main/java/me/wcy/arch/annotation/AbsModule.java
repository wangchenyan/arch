package me.wcy.arch.annotation;

import org.jetbrains.annotations.NotNull;

/**
 * Created by wcy on 2020/12/10.
 */
public abstract class AbsModule implements Comparable<AbsModule> {
    public final static int MAX_PRIORITY = Integer.MAX_VALUE;
    public final static int HIGH_PRIORITY = 1000;
    public final static int NORM_PRIORITY = 0;
    public final static int LOW_PRIORITY = -1000;
    public final static int MIN_PRIORITY = Integer.MIN_VALUE;

    public abstract boolean isSupportMultiProcess();

    public int getPriority() {
        return NORM_PRIORITY;
    }

    public void onTrimMemory(int level) {
    }

    public void onLowMemory() {
    }

    @Override
    public int compareTo(@NotNull AbsModule module) {
        return -Integer.compare(getPriority(), module.getPriority());
    }
}
