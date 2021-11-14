package com.cricketscoreapp.utils

/**
 * This is a class that contains all the needed constants
 * @author Al Mujahid Khan
 * */
class Constants {

    class Default {
        companion object {
            const val DEFAULT_STRING: String = ""
            const val DEFAULT_INTEGER: Int = 0
            const val DEFAULT_FLOAT: Float = 0.0f
            const val DEFAULT_LONG: Long = 0
            const val DEFAULT_BOOLEAN: Boolean = false
            const val DEFAULT_LANGUAGE: String = "en"
            const val TRUE_INTEGER: Int = 1
            const val FALSE_INTEGER: Int = 0
        }
    }

    class ACTION {
        companion object {
            const val ACTION_PURCHASE_FROM_MAIN = 12
        }
    }

    class Common {
        companion object {
            const val DEVICE_TYPE_ANDROID = 1
            const val PROPER_BASE_URL = "http://orion.tstaffs.com/"
            const val PATH_SEGMENT_API = "api"
            const val PATH_SEGMENT_SLASH = ""
            const val HTTP = "http"
            const val HTTPS = "https"
            const val IMAGE_STORING_SUFFIX = ".png"
            const val NEW_LINE_CHARACTER = "\n"
            const val IMAGE_STORING_PREFIX = "share_image_"
            const val DEVICE_TYPE = "android"
            const val COMMA = ","
            const val FIRST_BRACKET = "("
            const val API_SECRET_CODE = "EH5m5%\$+3V\$7Ue4j3*Kc5UzA4Mq7TXEt8a!8^AJ#"
            const val ANDROID_HASH_KEY = "Hash Key"
            const val PLAIN_TEXT_MIME_TYPE = "text/plain"
            const val PNG_IMAGE_MIME_TYPE = "image/png"
            const val ALL_IMAGE_MIME_TYPE = "image/*"
            const val JPEG_IMAGE_MIME_TYPE = "image/jpeg"
            const val COMMON_TIME_ZONE = "UTC"
            const val APP_COMMON_DATE_FORMAT: String = "yyyy-MM-dd HH:mm"
            const val APP_PROFILE_DATE_FORMAT: String = "dd/MM/yyyy"
            const val APP_COMMON_ONLY_DATE_FORMAT: String = "yyyy-MM-dd"
            const val APP_COMMON_TIME_FORMAT: String = "hh:mm a"
            const val APP_COMMON_DAY_FORMAT: String = "E"
            const val APP_COMMON_MONTH_FORMAT: String = "MMM"
            const val ALIGNMENT_LEFT: String = "left"
            const val ALIGNMENT_RIGHT: String = "right"
            const val ALIGNMENT_INHERIT: String = "inherit"
            const val ROLE = "Bearer "
            const val TELEPHONE_URI_STARTING = "tel:"
            const val GOOGLE_DOC_TOOLBAR_REMOVING_URL = "javascript:(function() { " +
                    "document.querySelector('[role=\"toolbar\"]').remove();" +
                    "})()"
            const val PREFIX_PDF_LOADING_URL = "https://docs.google.com/gview?embedded=true&url="
            const val BASE_URL_APP_RESOURCES = "file:///android_res/"
            const val HTML_JUSTIFIED_STYLE = "<html>" +
                    "<style type='text/css'>" +
                    "@font-face {" +
                    "font-family: MyFont;" +
                    "src: url('font/regular.ttf')" +
                    "}" +
                    "body {" +
                    "margin: 0;" +
                    "line-height: 1.5;" +
                    "padding: 0;" +
                    "font-family: MyFont;" +
                    "font-size: 14px;" +
                    "text-align: justify;" +
                    "color: #434343" +
                    "}" +
                    "</style>" +
                    "<body>%s" +
                    "</body>" +
                    "</html>"
            const val HTML_SMALL_JUSTIFIED_STYLE = "<html>" +
                    "<style type='text/css'>" +
                    "@font-face {" +
                    "font-family: MyFont;" +
                    "src: url('font/raleway_regular.ttf')" +
                    "}" +
                    "body {" +
                    "margin: 0;" +
                    "line-height: 1.5;" +
                    "padding: 0;" +
                    "font-family: MyFont;" +
                    "font-size: 12px;" +
                    "text-align: justify;" +
                    "color: #FFFFFF" +
                    "}" +
                    "</style>" +
                    "<body>%s" +
                    "</body>" +
                    "</html>"
            const val HTML_MIME_TYPE = "text/html"
            const val HTML_ENCODING = "UTF-8"
            const val PRODUCT_TYPE_BIDS = 2
            const val PRODUCT_TYPE_SOFTWARE = 1
        }
    }

    class File {
        companion object {
            const val PREFIX_IMAGE = "IMG_"
            const val PREFIX_CROPPED_IMAGE = "IMG_CROPPED_"
            const val SUFFIX_IMAGE = ".jpg"
        }
    }

    class PreferenceKeys {
        companion object {
            const val USER_ID = "user_id"
            const val IS_LOGIN = "isLogin"
            const val QUIZ_LENGTH = "quiz_length"
        }
    }

    class IntentKeys {
        companion object {
            const val REGISTER_ID = "register_id"
            const val IS_LOGGED_IN = "IS_LOGGED_IN"
            const val QUIZ_ANSWER = "QUIZ_ANSWER"
            const val SCORE = "score"
            const val LENGTH = "length"
        }
    }

    class QUIZ_TYPE {
        companion object {
            const val ACDAEP = "ACDAEP"
            const val ACSAAEP = "ACSAAEP"
            const val ACCPEP = "ACCPEP"
            const val AFEP = "AFEP"
            const val AAEP = "AAEP"
            const val GACE = "GACE"
            const val DAD = "DAD"
            const val ML = "ML"
        }
    }

    class QUIZ_GAME_TYPE {
        companion object {
            const val QUIZ = "quiz"
            const val EXAM = "exam"
            const val AZURE = "azure"
            const val HTML = "html"
        }
    }

    class BundleKeys {
        companion object {
            const val APP = "app"
            const val QUIZ_TYPE = "quiz_type"
            const val END_POINT = "end_point"
            const val GAME_TYPE = "game_type"
            const val IS_AZURE = "is_azure"
        }
    }

    class Answers {
        companion object {
            const val A = "A"
            const val B = "B"
            const val C = "C"
            const val D = "D"
        }
    }


    /**
     *
     * our retrofit client set end url with body ..
     * */
    class API {

        companion object {
            const val REGISTER = "register/"
            const val VERIFY = "verify/"
            const val DEVICE_LIST = "device_list/"
            const val DELETE_DEVICE = "delete_device/"
            const val Billing_And_Pricing = "Billing_And_Pricing/"
        }

        //0 - ok
        class ACCPEP {
            companion object {
                const val BILLING_AND_PRICING = "Billing_And_Pricing"
                const val CLOUD_CONCEPTS = "Cloud_Concepts"
                const val SECURITY_AND_COMPLIANCE = "Security"
                const val TECHNOLOGY = "Technology"
                const val CP_PRACTICE_EXAM1 = "CPP_Practice_Exam1"
                const val CP_PRACTICE_EXAM2 = "CPP_Practice_Exam2"
                const val CP_PRACTICE_EXAM3 = "CPP_Practice_Exam3"
                const val INDEX_AWS_FLASHCARDS = "index_aws_flashcards"
                const val INDEX_AWS_CHEAT_SHEETS = "index_aws_cheat_sheets"
                const val INDEX_AWS_RECOMMENDED_SECURITY_BEST_PRACTICES = "index_aws_recommended_security_best_practices"
                const val INDE_AWS_FAQS = "inde_aws_faqs"

                /*const val CPP_PRACTICE_EXAM1_ = "CPP_Practice_Exam1"
                  const val CPP_PRACTICE_EXAM2 = "CPP_Practice_Exam2"
                  const val CPP_PRACTICE_EXAM3 = "CPP_Practice_Exam3"*/
            }
        }

        //01 - ok
        class ACDAEP {
            companion object {
                const val DEPLOYMENT = "Deployment"
                const val Development_WITH_AWS = "Development_With_AWS"
                const val DEVELOPER_SECURITY = "Developer_Security"
                const val MORNING_AND_TROUBLESHOOTING = "Monitoring_And_TroubleShooting"
                const val REFACTORING = "Refactoring"
                const val DEV_ASS_PRACTICE_EXAM1 = "DevAssPracticeExam1"
                const val DEV_ASS_PRACTICE_EXAM2 = "DevAssPracticeExam2"
                const val DEV_ASS_PRACTICE_EXAM3 = "DevAssPracticeExam3"
                const val INDEX_AWS_FLASHCARDS = "index_aws_flashcards"
                const val INDEX_AWS_CHEAT_SHEETS = "index_aws_cheat_sheets"
                const val INDEX_AWS_RECOMMENDED_SECURITY_BEST_PRACTICES = "index_aws_recommended_security_best_practices"
                const val INDE_AWS_FAQS = "inde_aws_faqs"
            }
        }


        // ok..
        class ACSAAEP {
            companion object {
                const val DESIGN_RESILIENT_ARCHITECTURES = "Design_Resilient_Architectures"
                const val DESIGN_COST_OPTIMIZED_ARCHITECTURES = "Design_Cost_Optimized_Architectures"
                const val DESIGN_SECURE_APPLICATIONS_AND_ARCHITECTURES = "Design_Secure_Applications_And_Architectures"
                const val DESIGN_HIGH_PERFORMING_ARCHITECTURES = "Design_High_Performing_Architectures"


                // const val SPECIFY_SECURE_APPLICATIONS_AND_ARCHITECTURES = "Specify_Secure_Applications_And_Architectures"


                const val SAA_PRACTICE_EXAM1 = "SAA_Practice_Exam1"
                const val SAA_PRACTICE_EXAM2 = "SAA_Practice_Exam2"
                const val SAA_PRACTICE_EXAM3 = "SAA_Practice_Exam3"
                const val INDEX_AWS_FLASHCARDS = "index_aws_flashcards"
                const val INDEX_AWS_CHEAT_SHEETS = "index_aws_cheat_sheets"
                const val INDEX_AWS_RECOMMENDED_SECURITY_BEST_PRACTICES = "index_aws_recommended_security_best_practices"
                const val INDE_AWS_FAQS = "inde_aws_faqs"
            }
        }

        //ok.
        class AFEP {
            companion object {
                const val AZURE_SECURITY_PRIVACY_WORKLOADS = "Azure_Security_Privacy_Workloads"
                const val AZURE_BILLING_PRICING_SUPPORT = "Azure_Billing_Pricing_Support"
                const val AZURE_CLOUD_CONCEPTS = "Azure_Cloud_Concepts"
                const val AZURE_SERVICES = "Azure_Services"
                const val AZURE_PRACTICE_EXAM1 = "AzFun_PracticeExam1"
                const val AZURE_PRACTICE_EXAM2 = "AzFun_PracticeExam2"
                const val AZURE_PRACTICE_EXAM3 = "AzFun_PracticeExam3"
                const val INDEX_AWS_FLASHCARDS = "index_aws_flashcards"
                const val INDEX_AWS_CHEAT_SHEETS = "index_aws_cheat_sheets"
                const val INDE_AWS_FAQS = "inde_aws_faqs"


            }
        }

        // con 2- ok.
        class AAEP {
            companion object {

                const val MANAGE_AZURE_ACTIVE_DIRECTORY_IDENTIFY_AND_GOVERNANCE = "AZAdm_Manage_Azure_Active_Directory_Identity_and_Governance"
                const val IMPLEMENT_AND_MANAGE_AZURE_STORAGE = "AZAdm_Implement_and_Manage_Azure_Storage"
                const val CONFIGURE_AND_MANAGE_AZURE_NETWORKING_SERVICES = "AZAdm_Configure_and_Manage_Azure_Networking_Services"
                const val CONFIGURE_AND_MANAGE_AZURE_NETWORKING_SERVICES_SECOND = "AZAdm_Configure_and_Manage_Azure_Networking_Services"
                const val MONITOR_AND_BACKUP_AZURE_RESOURCES = "AZAdm_Monitor_and_Backup_Azure_Resources"


                // const val DEPLOY_AND_MANAGE_AZURE_COMPUTE_RESOURCES = "Deploy_and_Manage_Azure_Compute_Resources"

                const val PRACTICE_EXAM1 = "AzAdm_PracticeExam1"
                const val PRACTICE_EXAM2 = "AzAdm_PracticeExam2"
                const val PRACTICE_EXAM3 = "AzAdm_PracticeExam3"
                const val INDEX_AWS_FLASHCARDS = "index_aws_flashcards"
                const val INDEX_AWS_CHEAT_SHEETS = "index_aws_cheat_sheets"
                const val INDEX_AWS_FAQS = "inde_aws_faqs"

            }
        }

        // OK..
        class GACE {
            companion object {
                const val ENSURING_SUCCESSFUL_OPERATION_OF_CLOUD_SOLUTION = "gcloud_ensuring_successful_operation_of_cloud_solution"
                const val DEPLOY_AND_IMPLEMENT_A_COULD_SOLUTION = "gcloud_deploying_implementing_cloud_solution"
                const val SETTING_UP_CLOUD_SOLUTION_ENVIRONMENT = "gcloud_setting_up_cloud_solution_environment"
                const val CONFIGURING_ACCESS_AND_SECURITY = "gcloud_configuring_access_and_security"
                const val PLANNING_CONFIGURING_CLOUD_SOLUTION = "gcoud_planning_configuring_cloud_solution"
                const val GCP_ACE_PRACTICE_EXAM1 = "GCP_ACE_PracticeExam1"
                const val GCP_ACE_PRACTICE_EXAM2 = "GCP_ACE_PracticeExam2"
                const val GCP_ACE_PRACTICE_EXAM3 = "GCP_ACE_PracticeExam3"
            }
        }

        // There is no - api.
        class DAD {
            companion object {
                const val DATA_ANALYTICS_AWS_PRACTICE_EXAM1 = "DataAnalytics_AWS_PracticeExam1"
                const val DATA_ANALYTICS_AWS_PRACTICE_EXAM2 = "DataAnalytics_AWS_PracticeExam2"
                const val DATA_ANALYTICS_AWS_PRACTICE_EXAM3 = "DataAnalytics_AWS_PracticeExam3"
            }
        }

        //There is no - api.
        class ML {
            companion object {
                const val MACHINE_LEARNING_AWS_PRACTICE_EXAM1 = "MachineLearning_AWS_PracticeExam1"
                const val MACHINE_LEARNING_AWS_PRACTICE_EXAM2 = "MachineLearning_AWS_PracticeExam2"
                const val MACHINE_LEARNING_AWS_PRACTICE_EXAM3 = "MachineLearning_AWS_PracticeExam3"
            }
        }

        class Body {
            companion object {
                //register
                const val PHONE = "phone"
                const val NAME = "name"

                //verify
                const val ID = "id"
                const val otp = "otp"

                //add device
                const val USER_ID = "user_id"
                const val DEVICE_NAME = "device_name"
                const val DEVICE_NUMBER = "device_number"

                //get Device, complete.
                const val HOT_LINE = "hotline"
                const val WEBSITE = "website"
                const val EMAIL = "email"
                const val ADDRESS = "address"


            }
        }

        class ResponseFormat {
            companion object {
                const val JSON_RESPONSE = "Accept:application/json"
                const val API_KEY = "x-api-key: nxMk4nSM2v4T5noVRTpVP7HsPymx7AJu9UlgweKq"
            }
        }
    }


    class APP {
        companion object {
            const val IMO_PACKAGE = "com.imo.android.imoim"
            const val XIAOMI_PACKAGE = "com.android.mms"
        }
    }


    class LanguageCodes {
        companion object {
            const val ENGLISH = "en"
            const val PORTUGUESE = "pt"
        }
    }

}