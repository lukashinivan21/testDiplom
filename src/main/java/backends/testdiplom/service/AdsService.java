package backends.testdiplom.service;

import backends.testdiplom.dto.AdsCommentDto;
import backends.testdiplom.dto.AdsDto;
import backends.testdiplom.dto.FullAdsDto;
import backends.testdiplom.dto.ResponseWrapperDto;

public interface AdsService {

    ResponseWrapperDto<AdsDto> getAllAds();

    AdsDto addAds(AdsDto adsDto);

    ResponseWrapperDto<AdsDto> getAdsMe();

    ResponseWrapperDto<AdsCommentDto> getAdsComments(Integer ad_pk);

    AdsCommentDto addAdsComment(Integer ad_pk);

    void deleteAdsComment(Integer ad_pk, Integer id);

    AdsCommentDto getAdsComment(Integer ad_pk, Integer id);

    AdsCommentDto updateAdsComment(Integer ad_pk, Integer id);

    void removeAds(Integer id);

    FullAdsDto getAds(Integer id);

    AdsDto updateAds(Integer id);



    



}
