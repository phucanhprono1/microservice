package com.example.profilemanagement.service;

import com.example.profilemanagement.domain.EmployeeProfile;

import java.util.List;

public interface EmployeeProfileService {
    void addEmployeeProfile(EmployeeProfile profile);
    List < EmployeeProfile > getEmployeeProfiles();
}
