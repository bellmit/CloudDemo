package clouddemo.auth.api.pojo;

/**
 * Title       : ApiResponse
 * Package     : clouddemo.auth.api.pojo
 * Description : API接口的基础返回类
 * Create on   : 2018/12/23 22:09
 *
 * @author Yinglong.Hu
 * @version v1.0.0
 * <p>
 * 修改历史:
 * 修改人  :
 * 修改日期:
 * 修改描述:
 * -------------------------------------------
 */

public class ApiResponse<T> {

        /**
         * 是否成功
         */
        private boolean success;

        /**
         * 说明
         */
        private String msg;

        /**
         * 返回数据
         */
        private T data;

        public ApiResponse() {

        }

        public ApiResponse(boolean success, String msg, T data) {
            this.success = success;
            this.msg = msg;
            this.data = data;
        }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
