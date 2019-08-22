package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MyListData {

    @SerializedName("result")
    @Expose
    private List<Result> result = null;
    @SerializedName("targetUrl")
    @Expose
    private Object targetUrl;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("error")
    @Expose
    private Object error;
    @SerializedName("unAuthorizedRequest")
    @Expose
    private Boolean unAuthorizedRequest;
    @SerializedName("__abp")
    @Expose
    private Boolean abp;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Object getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(Object targetUrl) {
        this.targetUrl = targetUrl;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public Boolean getUnAuthorizedRequest() {
        return unAuthorizedRequest;
    }

    public void setUnAuthorizedRequest(Boolean unAuthorizedRequest) {
        this.unAuthorizedRequest = unAuthorizedRequest;
    }

    public Boolean getAbp() {
        return abp;
    }

    public void setAbp(Boolean abp) {
        this.abp = abp;
    }
    public class Result {
        public Result(String name, String description, String imagePath) {
            this.name=name;
            this.description=description;
            this.imagePath=imagePath;
        }
        /*@SerializedName("isOnMyWishlist")
        @Expose
        private Boolean isOnMyWishlist;*/
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("description")
        @Expose
        private Object description;
        @SerializedName("imagePath")
        @Expose
        private String imagePath;
       /* @SerializedName("imageName")
        @Expose
        private String imageName;
        @SerializedName("currencyName")
        @Expose
        private String currencyName;
        @SerializedName("isNew")
        @Expose
        private Boolean isNew;
        @SerializedName("isOnSale")
        @Expose
        private Boolean isOnSale;
        @SerializedName("price")
        @Expose
        private Double price;
       /* @SerializedName("rate")
        @Expose
        private Double rate;
        @SerializedName("discountPercentage")
        @Expose
        private Double discountPercentage;
        @SerializedName("discount")
        @Expose
        private Double discount;
        @SerializedName("priceAfterDiscount")
        @Expose
        private Double priceAfterDiscount;
        @SerializedName("brandId")
        @Expose
        private Integer brandId;*/
       /* @SerializedName("brandName")
        @Expose
        private String brandName;*/

       /* @SerializedName("leftLensPower")
        @Expose
        private String leftLensPower;
        @SerializedName("rightLensPower")
        @Expose
        private String rightLensPower;
        @SerializedName("leftLensPowerArr")
        @Expose
        private Object leftLensPowerArr;
        @SerializedName("rightLensPowerArr")
        @Expose
        private Object rightLensPowerArr;
        @SerializedName("lensPowerArr")
        @Expose
        private List<LensPowerArr> lensPowerArr = null;*/
       /* @SerializedName("itemImages")
        @Expose
        private List<ItemImage> itemImages = null;*/
        @SerializedName("imagesGallery")
        @Expose
        private List<String> imagesGallery = null;
        @SerializedName("id")
        @Expose
        private Integer id;

      /*  public Boolean getIsOnMyWishlist() {
            return isOnMyWishlist;
        }

        public void setIsOnMyWishlist(Boolean isOnMyWishlist) {
            this.isOnMyWishlist = isOnMyWishlist;
        }
*/
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

      /*  public String getImageName() {
            return imageName;
        }

        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        public String getCurrencyName() {
            return currencyName;
        }

        public void setCurrencyName(String currencyName) {
            this.currencyName = currencyName;
        }

        public Boolean getIsNew() {
            return isNew;
        }

        public void setIsNew(Boolean isNew) {
            this.isNew = isNew;
        }

        public Boolean getIsOnSale() {
            return isOnSale;
        }

        public void setIsOnSale(Boolean isOnSale) {
            this.isOnSale = isOnSale;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Double getRate() {
            return rate;
        }

        public void setRate(Double rate) {
            this.rate = rate;
        }

        public Double getDiscountPercentage() {
            return discountPercentage;
        }

        public void setDiscountPercentage(Double discountPercentage) {
            this.discountPercentage = discountPercentage;
        }

        public Double getDiscount() {
            return discount;
        }

        public void setDiscount(Double discount) {
            this.discount = discount;
        }

        public Double getPriceAfterDiscount() {
            return priceAfterDiscount;
        }

        public void setPriceAfterDiscount(Double priceAfterDiscount) {
            this.priceAfterDiscount = priceAfterDiscount;
        }

        public Integer getBrandId() {
            return brandId;
        }

        public void setBrandId(Integer brandId) {
            this.brandId = brandId;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }
*/
        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

      /*  public String getLeftLensPower() {
            return leftLensPower;
        }

        public void setLeftLensPower(String leftLensPower) {
            this.leftLensPower = leftLensPower;
        }

        public String getRightLensPower() {
            return rightLensPower;
        }

        public void setRightLensPower(String rightLensPower) {
            this.rightLensPower = rightLensPower;
        }

        public Object getLeftLensPowerArr() {
            return leftLensPowerArr;
        }

        public void setLeftLensPowerArr(Object leftLensPowerArr) {
            this.leftLensPowerArr = leftLensPowerArr;
        }

        public Object getRightLensPowerArr() {
            return rightLensPowerArr;
        }

        public void setRightLensPowerArr(Object rightLensPowerArr) {
            this.rightLensPowerArr = rightLensPowerArr;
        }

      /*  public List<LensPowerArr> getLensPowerArr() {
            return lensPowerArr;
        }

        public void setLensPowerArr(List<LensPowerArr> lensPowerArr) {
            this.lensPowerArr = lensPowerArr;
        }

        public List<ItemImage> getItemImages() {
            return itemImages;
        }

        public void setItemImages(List<ItemImage> itemImages) {
            this.itemImages = itemImages;
        }*/

        public List<String> getImagesGallery() {
            return imagesGallery;
        }

        public void setImagesGallery(List<String> imagesGallery) {
            this.imagesGallery = imagesGallery;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

    }

}