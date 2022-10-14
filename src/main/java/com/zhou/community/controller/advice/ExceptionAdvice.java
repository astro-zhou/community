package controller.advice;

/**
 * @author zyh
 * @create 2022-09-27 10:31
 */
//@ControllerAdvice(annotations = Controller.class)
//public class ExceptionAdvice {
//
//    public static final Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);
//
//    @ExceptionHandler({Exception.class})
//    public void handleException(Exception e, HttpServletRequest request, HttpServletResponse response) throws IOException {
//        logger.error("服务器发生异常" + e.getMessage());
//        for (StackTraceElement element : e.getStackTrace()) {
//            logger.error(element.toString());
//        }
//
//        String xRequestWith = request.getHeader("x-requested-with");
//        if ("XMLHttpRequest".equals(xRequestWith)) {
//            response.setContentType("application/plain;charset=utf-8");
//            PrintWriter writer = response.getWriter();
//            writer.write(CommunityUtil.getJSONString(1, "服务器异常!"));
//        } else {
//            response.sendRedirect(request.getContextPath() + "/error");
//        }
//    }
//
//}









