package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ReportDao;
@Service
public class ReportService {
  private ReportDao reportDao;
  public ReportService() {
	  System.out.println("0-param constructor");
  }
  @Autowired
  public void setReportDao(ReportDao reportDao) {
	  System.out.println("setReportDao() method called");
	  this.reportDao=reportDao;
  }
  public void printName(Integer userId) {
	 String nameById= reportDao.getNameById(userId);
	 System.out.println(nameById);
  }
}
