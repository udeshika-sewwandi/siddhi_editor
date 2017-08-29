/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.siddhi.siddhi.AggregationTimeDuration;
import org.xtext.example.siddhi.siddhi.DAYS;
import org.xtext.example.siddhi.siddhi.HOURS;
import org.xtext.example.siddhi.siddhi.MINUTES;
import org.xtext.example.siddhi.siddhi.MONTHS;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.WEEKS;
import org.xtext.example.siddhi.siddhi.YEARS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation Time Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getDays <em>Days</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getWeek <em>Week</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getWeeks <em>Weeks</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getMonths <em>Months</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AggregationTimeDurationImpl#getYears <em>Years</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationTimeDurationImpl extends SECONDSImpl implements AggregationTimeDuration
{
  /**
   * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinute()
   * @generated
   * @ordered
   */
  protected static final String MINUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinute()
   * @generated
   * @ordered
   */
  protected String minute = MINUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutes()
   * @generated
   * @ordered
   */
  protected static final String MINUTES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutes()
   * @generated
   * @ordered
   */
  protected String minutes = MINUTES_EDEFAULT;

  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final String MIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected String min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHour()
   * @generated
   * @ordered
   */
  protected static final String HOUR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHour()
   * @generated
   * @ordered
   */
  protected String hour = HOUR_EDEFAULT;

  /**
   * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHours()
   * @generated
   * @ordered
   */
  protected static final String HOURS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHours()
   * @generated
   * @ordered
   */
  protected String hours = HOURS_EDEFAULT;

  /**
   * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected static final String DAY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected String day = DAY_EDEFAULT;

  /**
   * The default value of the '{@link #getDays() <em>Days</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDays()
   * @generated
   * @ordered
   */
  protected static final String DAYS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDays() <em>Days</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDays()
   * @generated
   * @ordered
   */
  protected String days = DAYS_EDEFAULT;

  /**
   * The default value of the '{@link #getWeek() <em>Week</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeek()
   * @generated
   * @ordered
   */
  protected static final String WEEK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWeek() <em>Week</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeek()
   * @generated
   * @ordered
   */
  protected String week = WEEK_EDEFAULT;

  /**
   * The default value of the '{@link #getWeeks() <em>Weeks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeeks()
   * @generated
   * @ordered
   */
  protected static final String WEEKS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWeeks() <em>Weeks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeeks()
   * @generated
   * @ordered
   */
  protected String weeks = WEEKS_EDEFAULT;

  /**
   * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected static final String MONTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected String month = MONTH_EDEFAULT;

  /**
   * The default value of the '{@link #getMonths() <em>Months</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonths()
   * @generated
   * @ordered
   */
  protected static final String MONTHS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMonths() <em>Months</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonths()
   * @generated
   * @ordered
   */
  protected String months = MONTHS_EDEFAULT;

  /**
   * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected static final String YEAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected String year = YEAR_EDEFAULT;

  /**
   * The default value of the '{@link #getYears() <em>Years</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYears()
   * @generated
   * @ordered
   */
  protected static final String YEARS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYears() <em>Years</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYears()
   * @generated
   * @ordered
   */
  protected String years = YEARS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AggregationTimeDurationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SiddhiPackage.eINSTANCE.getAggregationTimeDuration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinute()
  {
    return minute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinute(String newMinute)
  {
    String oldMinute = minute;
    minute = newMinute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTE, oldMinute, minute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinutes()
  {
    return minutes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinutes(String newMinutes)
  {
    String oldMinutes = minutes;
    minutes = newMinutes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTES, oldMinutes, minutes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(String newMin)
  {
    String oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHour()
  {
    return hour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHour(String newHour)
  {
    String oldHour = hour;
    hour = newHour;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__HOUR, oldHour, hour));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHours()
  {
    return hours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHours(String newHours)
  {
    String oldHours = hours;
    hours = newHours;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__HOURS, oldHours, hours));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDay()
  {
    return day;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDay(String newDay)
  {
    String oldDay = day;
    day = newDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__DAY, oldDay, day));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDays()
  {
    return days;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDays(String newDays)
  {
    String oldDays = days;
    days = newDays;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__DAYS, oldDays, days));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWeek()
  {
    return week;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeek(String newWeek)
  {
    String oldWeek = week;
    week = newWeek;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__WEEK, oldWeek, week));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWeeks()
  {
    return weeks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeeks(String newWeeks)
  {
    String oldWeeks = weeks;
    weeks = newWeeks;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__WEEKS, oldWeeks, weeks));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMonth()
  {
    return month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonth(String newMonth)
  {
    String oldMonth = month;
    month = newMonth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__MONTH, oldMonth, month));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMonths()
  {
    return months;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonths(String newMonths)
  {
    String oldMonths = months;
    months = newMonths;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__MONTHS, oldMonths, months));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getYear()
  {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYear(String newYear)
  {
    String oldYear = year;
    year = newYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__YEAR, oldYear, year));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getYears()
  {
    return years;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYears(String newYears)
  {
    String oldYears = years;
    years = newYears;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.AGGREGATION_TIME_DURATION__YEARS, oldYears, years));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTE:
        return getMinute();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTES:
        return getMinutes();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MIN:
        return getMin();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__HOUR:
        return getHour();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__HOURS:
        return getHours();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__DAY:
        return getDay();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__DAYS:
        return getDays();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__WEEK:
        return getWeek();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__WEEKS:
        return getWeeks();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MONTH:
        return getMonth();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MONTHS:
        return getMonths();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__YEAR:
        return getYear();
      case SiddhiPackage.AGGREGATION_TIME_DURATION__YEARS:
        return getYears();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTE:
        setMinute((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTES:
        setMinutes((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MIN:
        setMin((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__HOUR:
        setHour((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__HOURS:
        setHours((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__DAY:
        setDay((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__DAYS:
        setDays((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__WEEK:
        setWeek((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__WEEKS:
        setWeeks((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MONTH:
        setMonth((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MONTHS:
        setMonths((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__YEAR:
        setYear((String)newValue);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__YEARS:
        setYears((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTE:
        setMinute(MINUTE_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTES:
        setMinutes(MINUTES_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__HOUR:
        setHour(HOUR_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__HOURS:
        setHours(HOURS_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__DAY:
        setDay(DAY_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__DAYS:
        setDays(DAYS_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__WEEK:
        setWeek(WEEK_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__WEEKS:
        setWeeks(WEEKS_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MONTH:
        setMonth(MONTH_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MONTHS:
        setMonths(MONTHS_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__YEAR:
        setYear(YEAR_EDEFAULT);
        return;
      case SiddhiPackage.AGGREGATION_TIME_DURATION__YEARS:
        setYears(YEARS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTE:
        return MINUTE_EDEFAULT == null ? minute != null : !MINUTE_EDEFAULT.equals(minute);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTES:
        return MINUTES_EDEFAULT == null ? minutes != null : !MINUTES_EDEFAULT.equals(minutes);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MIN:
        return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__HOUR:
        return HOUR_EDEFAULT == null ? hour != null : !HOUR_EDEFAULT.equals(hour);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__HOURS:
        return HOURS_EDEFAULT == null ? hours != null : !HOURS_EDEFAULT.equals(hours);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__DAY:
        return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__DAYS:
        return DAYS_EDEFAULT == null ? days != null : !DAYS_EDEFAULT.equals(days);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__WEEK:
        return WEEK_EDEFAULT == null ? week != null : !WEEK_EDEFAULT.equals(week);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__WEEKS:
        return WEEKS_EDEFAULT == null ? weeks != null : !WEEKS_EDEFAULT.equals(weeks);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MONTH:
        return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__MONTHS:
        return MONTHS_EDEFAULT == null ? months != null : !MONTHS_EDEFAULT.equals(months);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__YEAR:
        return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
      case SiddhiPackage.AGGREGATION_TIME_DURATION__YEARS:
        return YEARS_EDEFAULT == null ? years != null : !YEARS_EDEFAULT.equals(years);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == MINUTES.class)
    {
      switch (derivedFeatureID)
      {
        case SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTE: return SiddhiPackage.MINUTES__MINUTE;
        case SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTES: return SiddhiPackage.MINUTES__MINUTES;
        case SiddhiPackage.AGGREGATION_TIME_DURATION__MIN: return SiddhiPackage.MINUTES__MIN;
        default: return -1;
      }
    }
    if (baseClass == HOURS.class)
    {
      switch (derivedFeatureID)
      {
        case SiddhiPackage.AGGREGATION_TIME_DURATION__HOUR: return SiddhiPackage.HOURS__HOUR;
        case SiddhiPackage.AGGREGATION_TIME_DURATION__HOURS: return SiddhiPackage.HOURS__HOURS;
        default: return -1;
      }
    }
    if (baseClass == DAYS.class)
    {
      switch (derivedFeatureID)
      {
        case SiddhiPackage.AGGREGATION_TIME_DURATION__DAY: return SiddhiPackage.DAYS__DAY;
        case SiddhiPackage.AGGREGATION_TIME_DURATION__DAYS: return SiddhiPackage.DAYS__DAYS;
        default: return -1;
      }
    }
    if (baseClass == WEEKS.class)
    {
      switch (derivedFeatureID)
      {
        case SiddhiPackage.AGGREGATION_TIME_DURATION__WEEK: return SiddhiPackage.WEEKS__WEEK;
        case SiddhiPackage.AGGREGATION_TIME_DURATION__WEEKS: return SiddhiPackage.WEEKS__WEEKS;
        default: return -1;
      }
    }
    if (baseClass == MONTHS.class)
    {
      switch (derivedFeatureID)
      {
        case SiddhiPackage.AGGREGATION_TIME_DURATION__MONTH: return SiddhiPackage.MONTHS__MONTH;
        case SiddhiPackage.AGGREGATION_TIME_DURATION__MONTHS: return SiddhiPackage.MONTHS__MONTHS;
        default: return -1;
      }
    }
    if (baseClass == YEARS.class)
    {
      switch (derivedFeatureID)
      {
        case SiddhiPackage.AGGREGATION_TIME_DURATION__YEAR: return SiddhiPackage.YEARS__YEAR;
        case SiddhiPackage.AGGREGATION_TIME_DURATION__YEARS: return SiddhiPackage.YEARS__YEARS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == MINUTES.class)
    {
      switch (baseFeatureID)
      {
        case SiddhiPackage.MINUTES__MINUTE: return SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTE;
        case SiddhiPackage.MINUTES__MINUTES: return SiddhiPackage.AGGREGATION_TIME_DURATION__MINUTES;
        case SiddhiPackage.MINUTES__MIN: return SiddhiPackage.AGGREGATION_TIME_DURATION__MIN;
        default: return -1;
      }
    }
    if (baseClass == HOURS.class)
    {
      switch (baseFeatureID)
      {
        case SiddhiPackage.HOURS__HOUR: return SiddhiPackage.AGGREGATION_TIME_DURATION__HOUR;
        case SiddhiPackage.HOURS__HOURS: return SiddhiPackage.AGGREGATION_TIME_DURATION__HOURS;
        default: return -1;
      }
    }
    if (baseClass == DAYS.class)
    {
      switch (baseFeatureID)
      {
        case SiddhiPackage.DAYS__DAY: return SiddhiPackage.AGGREGATION_TIME_DURATION__DAY;
        case SiddhiPackage.DAYS__DAYS: return SiddhiPackage.AGGREGATION_TIME_DURATION__DAYS;
        default: return -1;
      }
    }
    if (baseClass == WEEKS.class)
    {
      switch (baseFeatureID)
      {
        case SiddhiPackage.WEEKS__WEEK: return SiddhiPackage.AGGREGATION_TIME_DURATION__WEEK;
        case SiddhiPackage.WEEKS__WEEKS: return SiddhiPackage.AGGREGATION_TIME_DURATION__WEEKS;
        default: return -1;
      }
    }
    if (baseClass == MONTHS.class)
    {
      switch (baseFeatureID)
      {
        case SiddhiPackage.MONTHS__MONTH: return SiddhiPackage.AGGREGATION_TIME_DURATION__MONTH;
        case SiddhiPackage.MONTHS__MONTHS: return SiddhiPackage.AGGREGATION_TIME_DURATION__MONTHS;
        default: return -1;
      }
    }
    if (baseClass == YEARS.class)
    {
      switch (baseFeatureID)
      {
        case SiddhiPackage.YEARS__YEAR: return SiddhiPackage.AGGREGATION_TIME_DURATION__YEAR;
        case SiddhiPackage.YEARS__YEARS: return SiddhiPackage.AGGREGATION_TIME_DURATION__YEARS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (minute: ");
    result.append(minute);
    result.append(", minutes: ");
    result.append(minutes);
    result.append(", min: ");
    result.append(min);
    result.append(", hour: ");
    result.append(hour);
    result.append(", hours: ");
    result.append(hours);
    result.append(", day: ");
    result.append(day);
    result.append(", days: ");
    result.append(days);
    result.append(", week: ");
    result.append(week);
    result.append(", weeks: ");
    result.append(weeks);
    result.append(", month: ");
    result.append(month);
    result.append(", months: ");
    result.append(months);
    result.append(", year: ");
    result.append(year);
    result.append(", years: ");
    result.append(years);
    result.append(')');
    return result.toString();
  }

} //AggregationTimeDurationImpl
