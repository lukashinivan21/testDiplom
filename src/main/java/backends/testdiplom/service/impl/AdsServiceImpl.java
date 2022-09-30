package backends.testdiplom.service.impl;

import backends.testdiplom.dto.AdsCommentDto;
import backends.testdiplom.dto.AdsDto;
import backends.testdiplom.dto.FullAdsDto;
import backends.testdiplom.dto.ResponseWrapperDto;
import backends.testdiplom.service.AdsService;

public class AdsServiceImpl implements AdsService {





    @Override
    public ResponseWrapperDto<AdsDto> getAllAds() {
        return null;
    }

    @Override
    public AdsDto addAds(AdsDto adsDto) {
        return null;
    }

    @Override
    public ResponseWrapperDto<AdsDto> getAdsMe() {
        return null;
    }

    @Override
    public ResponseWrapperDto<AdsCommentDto> getAdsComments(Integer ad_pk) {
        return null;
    }

    @Override
    public AdsCommentDto addAdsComment(Integer ad_pk) {
        return null;
    }

    @Override
    public void deleteAdsComment(Integer ad_pk, Integer id) {

    }

    @Override
    public AdsCommentDto getAdsComment(Integer ad_pk, Integer id) {
        return null;
    }

    @Override
    public AdsCommentDto updateAdsComment(Integer ad_pk, Integer id) {
        return null;
    }

    @Override
    public void removeAds(Integer id) {

    }

    @Override
    public FullAdsDto getAds(Integer id) {
        return null;
    }

    @Override
    public AdsDto updateAds(Integer id) {
        return null;
    }
}
