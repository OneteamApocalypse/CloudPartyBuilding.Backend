package apocalypse.cloudpartybuilding.util;

import java.util.List;
import java.util.Map;

public class RespBean {
    private String status;
    private String msg;
    private int totalCount;
    private List<Map<String,Object>> list;
    public static int defaultSize = 5;
    public RespBean() {
        super();
    }
    public RespBean(String status, String msg) { //增删改统一返回对象初始化
        super();
        this.status = status;
        this.msg = msg;
    }
    //列表分页作为返回的数据
    public RespBean(String status, String msg, int totalCount, List<Map<String, Object>> list) {
        super();
        this.status = status;
        this.msg = msg;
        this.totalCount = totalCount;
        this.list = list;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public List<Map<String, Object>> getList() {
        return list;
    }
    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((list == null) ? 0 : list.hashCode());
        result = prime * result + ((msg == null) ? 0 : msg.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + totalCount;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RespBean other = (RespBean) obj;
        if (list == null) {
            if (other.list != null)
                return false;
        } else if (!list.equals(other.list))
            return false;
        if (msg == null) {
            if (other.msg != null)
                return false;
        } else if (!msg.equals(other.msg))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (totalCount != other.totalCount)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "RespBean [status=" + status + ", msg=" + msg + ", totalCount=" + totalCount + ", list=" + list + "]";
    }
}
