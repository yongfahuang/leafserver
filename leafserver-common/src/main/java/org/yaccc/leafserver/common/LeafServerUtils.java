package org.yaccc.leafserver.common;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by xiezhaodong  on 2018/3/17
 */
public class LeafServerUtils {

    public static Result wrapperResult(Result result) {
        long id = result.getId();
        if (id < 0) {
            switch ((int) id) {
                case -1:
                    result.setErrMsg("xxxxx-1");
                    break;
                case -2:
                    result.setErrMsg("xxxxx-2");
                    break;
                default:
                    break;
            }
        } else {
            result.setSuccess(true);
        }
        return result;
    }

    /**
     * get next id when segment have it
     *
     * @param segment
     * @return nextId
     */
    public static Long getSegmentId(Segment segment) {
        AtomicLong current = segment.getLongFactory();
        if (current.longValue() <= segment.getMax()) {
            return current.getAndIncrement();
        }

        segment.setInitCompleted(false);//to false

        return null;
    }



}
