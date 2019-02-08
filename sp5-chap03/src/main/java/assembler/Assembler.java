package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {
    private MemberDao memberDao;
    private MemberRegisterService regSvc;
    private ChangePasswordService pwdSvc;

    public Assembler() {
        memberDao = new MemberDao();
        regSvc = new MemberRegisterService(memberDao);
        pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
    }

    /**
     * @return the memberDao
     */
    public MemberDao getMemberDao() {
        return memberDao;
    }

    /**
     * @return the regSvc
     */
    public MemberRegisterService getMemberRegisterService() {
        return regSvc;
    }

    /**
     * @return the pwdSvc
     */
    public ChangePasswordService getChangePasswordService () {
        return pwdSvc;
    }
}