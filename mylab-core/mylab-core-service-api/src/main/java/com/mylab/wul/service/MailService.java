package com.mylab.wul.service;

import com.mylab.wul.dto.MailRequest;

/**
* <h1>MailService</h1>
* MailService interface definition 
* <p>
* <b>MailService</b> definition of methods of interface
* for sevice layer
*
* @author  Cristian Romero Matesanz
*
* 
*/
public interface MailService {

    /**
     * Method to send an email whith information request
     * @param mailrequest mail request to send by email protocol
     */
    public void sendMail(MailRequest mailrequest);

}
